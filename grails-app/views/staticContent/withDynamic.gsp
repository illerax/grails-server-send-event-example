<!doctype html>
<html>
<head>
  <meta name="layout" content="main"/>
  <title>With SSE</title>

  <asset:link rel="icon" href="favicon.ico" type="image/x-ico"/>
</head>
<body>
<div id="content" role="main">
  <section class="row">
    <h1>With SSE</h1>
    <table class="table">
      <thead>
      <tr>
        <th width="80%">Operation</th>
        <th>Initial value</th>
        <th>Result</th>
      </tr>
      </thead>
      <tbody>
      <g:each in="${tasks}" var="task">
        <tr class="task" id="${task.id}">
          <td>${task.name}</td>
          <td>${task.value}</td>
          <td class="calculated"><div class="loader"></div></td>
        </tr>
      </g:each>
      </tbody>
    </table>
  </section>
</div>
<script>
    $(document).ready(function () {
        var data = [];
        $('.task').each(function () {
            data.push($(this).attr('id'));
        });
        var eventSource = new EventSource("${g.createLink(controller: 'dynamicContent', action:'getDynamicValues')}?tasks=" + JSON.stringify(data));
        eventSource.onmessage = function (event) {
            JSON.parse(event.data, function (k, v) {
                var td = $('#' + k).find('.calculated');
                td.find('div').removeClass('loader');
                td.find('div').text(v);
            });
        };
        eventSource.onerror = function (event) {
            eventSource.close()
        };
    });
</script>
</body>
</html>

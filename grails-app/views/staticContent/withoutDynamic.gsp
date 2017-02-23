<!doctype html>
<html>
<head>
  <meta name="layout" content="main"/>
  <title>Without SSE</title>

  <asset:link rel="icon" href="favicon.ico" type="image/x-ico"/>
</head>

<body>
<div id="content" role="main">
  <section class="row">
    <h1>Without SSE</h1>
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
        <tr>
          <td>${task.name}</td>
          <td>${task.value}</td>
          <td>${task.result}</td>
        </tr>
      </g:each>
      </tbody>
    </table>
  </section>
</div>

</body>
</html>

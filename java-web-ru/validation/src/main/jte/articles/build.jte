@import gg.jte.Content
@param Content content
@param Content footer = null

<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Hexlet Javalin Example</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
          crossorigin="anonymous">
</head>
<body>
<form action="/articles" method="post">
    <fieldset>
        <legend>Поле создания статьи</legend>
        <label>
            Название
            <input type="text" name="title" placeholder="Введите название статьи">
        </label>
        <br>

        <label>
            Текст статьи
            <textarea name="content" placeholder="Здесь должно быть содержимое статьи"></textarea>
        </label>
        <br>
    </fieldset>

    <button>Создать статью</button>
</form>>
</body>
</html>
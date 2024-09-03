@import exercise.dto.articles.BuildArticlePage
@param BuildArticlePage page

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
@if(page.getErrors() != null)
    <div class="mb-3">
        <ul>
            @for(var validator : page.getErrors().values())
                @for(var error : validator)
                    <li>${error.getMessage()}</li>
                @endfor
            @endfor
        </ul>
    </div>
@endif
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
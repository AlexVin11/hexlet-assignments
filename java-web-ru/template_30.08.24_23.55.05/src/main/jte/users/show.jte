@import exercise.dto.users.UserPage
@param UserPage page

<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Hello Hexlet!</title>
</head>
<body>
<div class="col-lg-8 mx-auto p-4 py-md-5">
    <main>
        <h2>${pageForUser.getUser().getFirstName()} ${pageForUser.getUser().getLastName()}</h2>
        <div>${pageForUser.getUser().getEmail()}</div>
    </main>
</div>
</body>
</html>
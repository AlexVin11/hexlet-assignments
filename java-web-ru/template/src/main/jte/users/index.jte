@import exercise.dto.users.UsersPage
@param UsersPage pageForUsers

<html>
<head>
    <title>Хекслет</title>
</head>
<body>
<h1>Пользователи</h1>
<table class="table table-striped">
    @for(var user : pageForUsers.getUsers())
        <tr>
            <td>
                ${user.getId()}
            </td>
            <td>
                <a href="/users/${user.getId()}">${user.getFirstName()} ${user.getLastName()}</a>
            </td>
        </tr>
    @endfor
</table>
</body>
</html>
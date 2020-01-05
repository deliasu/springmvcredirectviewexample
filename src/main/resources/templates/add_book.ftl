<!Doctype html>
<html>
<head>
    <title>Add book Information</title>
</head>
<body>
<h3>Add Book Information</h3>
<form method = "post" action="/add-book">
    <table>
        <tr>
            <td>Isbn</td>
            <td><input type="text" name="isbn"/></td>
        </tr>
        <tr>
            <td>Title</td>
            <td><input type="text" name="title"/></td>
        </tr>
        <tr>
            <td>Author</td>
            <td><input type="text" name="author"/></td>
        </tr>
        <tr>
            <td>Quantity</td>
            <td><input type="number" name="quantity"/></td>
        </tr>
        <tr>
            <td></td>
            <td><button type="submit">Submit</button> </td>
        </tr>
    </table>
</form>
</body>
</html>

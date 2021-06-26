## Duqani - დუქნის ლომები

## დეველოპმენტის გარემოს მოწყობა

### MySQL-ის გაშვება კონტეინერში

```bash
docker run --name duqani-db  -p 3307:3306 -e MYSQL_ROOT_PASSWORD=bdC9Kt0 -e MYSQL_DATABASE=duqani  -e TZ='Asia/Tbilisi' -d mysql
``` 
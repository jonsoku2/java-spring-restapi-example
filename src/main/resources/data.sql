insert into user values(9001, sysdate(), 'User1', 'test1111', '7010100-123213');
insert into user values(9002, sysdate(), 'User2', 'test2222', '8010100-123213');
insert into user values(9003, sysdate(), 'User3', 'test3333', '9010100-123213');

insert into post values(10001, 'My First Post', 9001);
insert into post values(10002, 'My Second Post', 9001);
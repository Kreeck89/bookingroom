insert into users (name, password, surname, id) values ('Alex', '12345', 'Bobovich', 1)
insert into users (name, password, surname, id) values ('Ann', '123', 'Smith', 2)
insert into users (name, password, surname, id) values ('Mike', 'qwerty', 'Neg', 3)
insert into users (name, password, surname, id) values ('Jin', '123456', 'My', 4)
insert into users (name, password, surname, id) values ('Jon', '123qwe', 'Wain', 5)
insert into rooms (category, number, price, id) values ('STANDARD', 101, 25, 1)
insert into rooms (category, number, price, id) values ('STANDARD', 102, 25, 2)
insert into rooms (category, number, price, id) values ('STANDARD', 103, 25, 3)
insert into rooms (category, number, price, id) values ('STANDARD', 104, 25, 4)
insert into rooms (category, number, price, id) values ('STANDARD', 105, 25, 5)
insert into rooms (category, number, price, id) values ('LUX', 201, 45, 6)
insert into rooms (category, number, price, id) values ('LUX', 202, 45, 7)
insert into rooms (category, number, price, id) values ('LUX', 203, 45, 8)
insert into rooms (category, number, price, id) values ('LUX', 204, 45, 9)
insert into rooms (category, number, price, id) values ('LUX', 205, 45, 10)
insert into breakfasts (room_id, price, id) values (NULL, 5, 1)
insert into breakfasts (room_id, price, id) values (NULL, 5, 2)
insert into breakfasts (room_id, price, id) values (NULL, 5, 3)
insert into breakfasts (room_id, price, id) values (NULL, 5, 4)
insert into breakfasts (room_id, price, id) values (NULL, 5, 5)
insert into breakfasts (room_id, price, id) values (NULL, 5, 6)
insert into breakfasts (room_id, price, id) values (NULL, 5, 7)
insert into cleanings (room_id, price, id) values (NULL, 5, 1)
insert into cleanings (room_id, price, id) values (NULL, 5, 2)
insert into cleanings (room_id, price, id) values (NULL, 5, 3)
insert into cleanings (room_id, price, id) values (NULL, 5, 4)
insert into cleanings (room_id, price, id) values (NULL, 5, 5)
insert into cleanings (room_id, price, id) values (NULL, 5, 6)
insert into cleanings (room_id, price, id) values (NULL, 5, 7)
insert into cleanings (room_id, price, id) values (NULL, 5, 8)
insert into reserves (date, room_id, user_id, id) values (TO_DATE('2018-03-08', 'yyyy/mm/dd'), NULL, NULL, 1)
UPDATE reserves SET room_id = 1, user_id = 1 WHERE id = 1
UPDATE breakfasts SET room_id = 1 WHERE id = 1
insert into reserves (date, room_id, user_id, id) values (TO_DATE('2018-03-09', 'yyyy/mm/dd'), NULL, NULL, 2)
UPDATE reserves SET room_id = 1, user_id = 1 WHERE id = 2
UPDATE breakfasts SET room_id = 1 WHERE id = 2

insert into reserves (date, room_id, user_id, id) values (TO_DATE('2018-03-08', 'yyyy/mm/dd'), NULL, NULL, 3)
UPDATE reserves SET room_id = 2, user_id = 2 WHERE id = 3
UPDATE cleanings SET room_id = 2 WHERE id = 1
insert into reserves (date, room_id, user_id, id) values (TO_DATE('2018-03-09', 'yyyy/mm/dd'), NULL, NULL, 4)
UPDATE reserves SET room_id = 2, user_id = 2 WHERE id = 4
UPDATE cleanings SET room_id = 2 WHERE id = 2
insert into reserves (date, room_id, user_id, id) values (TO_DATE('2018-03-10', 'yyyy/mm/dd'), NULL, NULL, 5)
UPDATE reserves SET room_id = 2, user_id = 2 WHERE id = 5
UPDATE cleanings SET room_id = 2 WHERE id = 3

insert into reserves (date, room_id, user_id, id) values (TO_DATE('2018-03-10', 'yyyy/mm/dd'), NULL, NULL, 6)
UPDATE reserves SET room_id = 3, user_id = 3 WHERE id = 6
UPDATE breakfasts SET room_id = 3 WHERE id = 3
UPDATE cleanings SET room_id = 3 WHERE id = 4
insert into reserves (date, room_id, user_id, id) values (TO_DATE('2018-03-11', 'yyyy/mm/dd'), NULL, NULL, 7)
UPDATE reserves SET room_id = 3, user_id = 3 WHERE id = 7
UPDATE breakfasts SET room_id = 3 WHERE id = 4
UPDATE cleanings SET room_id = 3 WHERE id = 5
insert into reserves (date, room_id, user_id, id) values (TO_DATE('2018-03-12', 'yyyy/mm/dd'), NULL, NULL, 8)
UPDATE reserves SET room_id = 3, user_id = 3 WHERE id = 8
UPDATE breakfasts SET room_id = 3 WHERE id = 5
UPDATE cleanings SET room_id = 3 WHERE id = 6
insert into reserves (date, room_id, user_id, id) values (TO_DATE('2018-03-13', 'yyyy/mm/dd'), NULL, NULL, 9)
UPDATE reserves SET room_id = 3, user_id = 3 WHERE id = 9
UPDATE breakfasts SET room_id = 3 WHERE id = 6
UPDATE cleanings SET room_id = 3 WHERE id = 7
insert into reserves (date, room_id, user_id, id) values (TO_DATE('2018-03-14', 'yyyy/mm/dd'), NULL, NULL, 10)
UPDATE reserves SET room_id = 3, user_id = 3 WHERE id = 10
UPDATE breakfasts SET room_id = 3 WHERE id = 7
UPDATE cleanings SET room_id = 3 WHERE id = 8
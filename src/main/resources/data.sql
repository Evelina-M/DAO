insert into CUSTOMERS (NAME, SURNAME, AGE, PHONE_NUMBER)
values ('IVAN', 'IVANOV', 42, +79999999999),
       ('PETER', 'PETROV', 58, +78888888888),
       ('ALEXEY', 'ALEXANDROV', 14, +77777777777);

insert into ORDERS (date, customer_id, product_name, amount)
values (current_date, 1, 'smartphone', 6);
values (current_date, 2, 'laptop', 4);
values (current_date, 3, 'iphone', 1);
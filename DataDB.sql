-- Bảng employees
INSERT INTO employees (emp_id, address, dob, email, full_name, phone, status)
VALUES (3, '789 Willow Lane', '1988-06-20', 'employee3@email.com', 'Sarah Johnson', '555-555-5555', 'Active');

INSERT INTO employees (emp_id, address, dob, email, full_name, phone, status)
VALUES (4, '101 Birch Street', '1995-09-10', 'employee4@email.com', 'Michael Brown', '555-111-2222', 'Active');

INSERT INTO employees (emp_id, address, dob, email, full_name, phone, status)
VALUES (5, '202 Maple Avenue', '1983-04-05', 'employee5@email.com', 'Emily Davis', '555-333-4444', 'Active');

-- Bảng Customer
INSERT INTO customers (cust_id, address, cust_name, email, phone)
VALUES (3, '303 Cedar Road', 'Customer 3', 'customer3@email.com', '555-777-8888');

INSERT INTO customers (cust_id, address, cust_name, email, phone)
VALUES (4, '404 Redwood Drive', 'Customer 4', 'customer4@email.com', '555-999-0000');

-- Bảng Product
INSERT INTO products (product_id, description, manufacturer_name, name, status, unit)
VALUES (3, 'Product 3 Description', 'Manufacturer C', 'Product 3', 'Active', 'Unit C');

INSERT INTO products (product_id, description, manufacturer_name, name, status, unit)
VALUES (4, 'Product 4 Description', 'Manufacturer D', 'Product 4', 'Active', 'Unit D');

INSERT INTO products (product_id, description, manufacturer_name, name, status, unit)
VALUES (5, 'Product 5 Description', 'Manufacturer E', 'Product 5', 'Active', 'Unit E');

INSERT INTO products (product_id, description, manufacturer_name, name, status, unit)
VALUES (6, 'Product 6 Description', 'Manufacturer F', 'Product 6', 'Active', 'Unit D');

-- Bảng ProductImage
INSERT INTO product_images (image_id, alternative, path, product_id)
VALUES (3, 'Phone Image 1', 'https://cdn2.cellphones.com.vn/358x358,webp,q100/media/catalog/product/t/e/text_ng_n_2__1.png', 3);

INSERT INTO product_images (image_id, alternative, path, product_id)
VALUES (4, 'Phone Image 2', 'https://cdn2.cellphones.com.vn/358x358,webp,q100/media/catalog/product/a/s/asus_x515ma-br481w.png', 4);

INSERT INTO product_images (image_id, alternative, path, product_id)
VALUES (5, 'Phone Image 3', 'https://cdn2.cellphones.com.vn/358x358,webp,q100/media/catalog/product/t/e/text_ng_n_1__1_120.png', 3);

INSERT INTO product_images (image_id, alternative, path, product_id)
VALUES (6, 'Phone Image 4', 'https://cdn2.cellphones.com.vn/358x358,webp,q100/media/catalog/product/m/a/macbook_air_m2_8gb.png', 4);

-- Bảng ProductPrice
INSERT INTO product_prices (price_date_time, note, price, product_id)
VALUES ('2023-09-23 10:00:00', 'Price for Product 3', 19.99, 3);

INSERT INTO product_prices (price_date_time, note, price, product_id)
VALUES ('2023-09-24 11:00:00', 'Price for Product 4', 24.99, 4);

INSERT INTO product_prices (price_date_time, note, price, product_id)
VALUES ('2023-09-25 12:00:00', 'Price for Product 5', 29.99, 5);


INSERT INTO product_prices (price_date_time, note, price, product_id)
VALUES ('2023-09-25 12:00:00', 'Price for Product 5', 23.99, 6);

-- Bảng Order
INSERT INTO orders (order_id, order_date, cust_id, emp_id)
VALUES (2, '2023-09-23', 3, 3);

INSERT INTO orders (order_id, order_date, cust_id, emp_id)
VALUES (3, '2023-09-24', 4, 4);

-- Bảng OrderDetail
INSERT INTO order_details (note, price, quantity, order_id, product_id)
VALUES ('Detail 3', 20.99, 1, 2, 3);

INSERT INTO order_details ( note, price, quantity, order_id, product_id)
VALUES ('Detail 4', 25.99, 2, 2, 4);

CREATE TABLE user (
    user_id integer identity NOT NULL,
    name varchar(200) NOT NULL,
    email varchar(120) NOT NULL,
    password varchar(255) NOT NULL,
    role varchar(10) NOT NULL,
    CONSTRAINT pk_user_id PRIMARY KEY (user_id)
);

CREATE TABLE product (
    product_id integer identity NOT NULL,
    description varchar(100) NOT NULL,
    price decimal(10, 4) NOT NULL,
    user_id integer,
    CONSTRAINT pk_product_id PRIMARY KEY (product_id),
    FOREIGN KEY (user_id) REFERENCES user (user_id)
);

CREATE TABLE vegetable (
    product_id integer NOT NULL,
    weight decimal(10, 4) NOT NULL,
    PRIMARY KEY (product_id),
    FOREIGN KEY (product_id) REFERENCES product (product_id)
);

CREATE TABLE fruit (
    product_id integer NOT NULL,
    weight decimal(10, 4) NOT NULL,
    juicy bit(1) DEFAULT 0,
    PRIMARY KEY (product_id),
    FOREIGN KEY (product_id) REFERENCES product (product_id)
);
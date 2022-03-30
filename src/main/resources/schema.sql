CREATE TABLE user (
    user_id integer identity NOT NULL,
    name varchar(200) NOT NULL,
    email varchar(120) NOT NULL,
    password varchar(255) NOT NULL,
    role varchar(10) NOT NULL,
    CONSTRAINT pk_user_id PRIMARY KEY (user_id)
);
/* Creating user table */
create table users (
                       id bigint not null auto_increment primary key,
                       name varchar (255) not null,
                       email varchar (255) not null,
                       password varchar (255) not null
);

/* Creating the address table */
create table addresses (
                           id bigint not null auto_increment primary key ,
                           street varchar (255) not null,
                           city varchar (255) not null,
                           zip varchar (255) not null,
                           user_id bigint not null,
                           state varchar (255) not null,
                           constraint fk_userid
                               foreign key (user_id)
                                   references users(id)
);

/* Creating the profile table */
create table profiles (
                          id bigint primary key,
                          bio text,
                          phone_number varchar(15),
                          date_of_birth date,
                          loyalty_points int unsigned default 0,
                          foreign key (id) references users(id)
);

/* Creating the tag table */
create table tag (
                     id int auto_increment primary key,
                     name varchar (255) not null
);

/* Creating the user-tag table */
create table user_tag (
                          user_id bigint not null,
                          tag_id int not null,
                          primary key (user_id, tag_id),
                          foreign key (user_id) references users(id) on delete cascade,
                          foreign key (tag_id) references tag(id) on delete cascade
);

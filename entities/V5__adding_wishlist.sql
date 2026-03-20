CREATE TABLE onlinestore.wishlist
(
    product_id BIGINT NOT NULL,
    user_id    BIGINT NOT NULL,
    CONSTRAINT pk_wishlist PRIMARY KEY (product_id, user_id)
);

ALTER TABLE onlinestore.wishlist
    ADD CONSTRAINT fk_wishlist_on_product FOREIGN KEY (product_id) REFERENCES onlinestore.products (id);

ALTER TABLE onlinestore.wishlist
    ADD CONSTRAINT fk_wishlist_on_user FOREIGN KEY (user_id) REFERENCES onlinestore.users (id);
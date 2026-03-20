CREATE TABLE onlinestore.whishlist
(
    product_id BIGINT NOT NULL,
    user_id    BIGINT NOT NULL,
    CONSTRAINT pk_whishlist PRIMARY KEY (product_id, user_id)
);

ALTER TABLE onlinestore.whishlist
    ADD CONSTRAINT fk_whishlist_on_product FOREIGN KEY (product_id) REFERENCES onlinestore.products (id);

ALTER TABLE onlinestore.whishlist
    ADD CONSTRAINT fk_whishlist_on_user FOREIGN KEY (user_id) REFERENCES onlinestore.users (id);
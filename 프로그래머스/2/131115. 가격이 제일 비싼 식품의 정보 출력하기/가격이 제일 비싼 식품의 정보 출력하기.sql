SELECT product_id, product_name, product_cd, category, price
FROM food_product
WHERE PRICE = (SELECT MAX(PRICE) FROM FOOD_PRODUCT);
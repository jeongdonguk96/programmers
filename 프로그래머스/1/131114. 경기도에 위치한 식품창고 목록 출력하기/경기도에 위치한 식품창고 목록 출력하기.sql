SELECT warehouse_id, warehouse_name, address, IFNULL(freezer_yn, 'N')
FROM food_warehouse
WHERE warehouse_name LIKE '창고_경기%'
ORDER BY warehouse_id ASC
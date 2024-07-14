SELECT count(*)
FROM user_info
WHERE joined LIKE '2021%'
AND age >= 20
AND age <= 29;
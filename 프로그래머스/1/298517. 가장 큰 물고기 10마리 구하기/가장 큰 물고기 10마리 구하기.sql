SELECT id ,length
FROM (SELECT id, length
    FROM fish_info
    ORDER BY length DESC
    LIMIT 10) as fish_info
ORDER BY length DESC, id ASC
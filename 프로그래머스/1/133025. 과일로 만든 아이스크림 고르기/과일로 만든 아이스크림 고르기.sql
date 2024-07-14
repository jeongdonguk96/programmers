SELECT h.flavor
FROM first_half h
JOIN icecream_info i ON h.flavor = i.flavor
WHERE h.total_order > 3000
AND i.ingredient_type = 'fruit_based'
ORDER BY h.total_order DESC
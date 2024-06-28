SELECT b.category as CATEGORY, sum(bs.sales) as TOTAL_SALES
FROM book b
JOIN book_sales bs on bs.book_id = b.book_id
WHERE TO_CHAR(bs.sales_date, 'yyyy-MM') = '2022-01'
GROUP BY b.category
ORDER BY b.category ASC;
-- 1.

SELECT DISTINCT
	first_name,
	last_name,
	pay.payment_date
FROM 
	customer AS cus
INNER JOIN payment AS pay
	ON cus.customer_id = pay.customer_id
WHERE payment_date
BETWEEN DATE '2007-04-01' AND '2007-5-14'
ORDER BY pay.payment_date ASC;


--  2.

SELECT 
	title,
	release_year,
	cat.name
FROM
	film AS f
INNER JOIN film_category AS fc
	ON f.film_id = fc.film_id
INNER JOIN category AS cat
	ON fc.category_id = cat.category_id
	WHERE cat.name = 'Action' OR cat.name = 'Animation'
	

-- 3.

SELECT
	first_name,
	last_name,
	r.rental_date
FROM 
	customer AS cus
INNER JOIN rental AS r
	ON cus.customer_id = r.customer_id
ORDER BY rental_date DESC;


-- 4. (I got little help with this question thanks to our telegram group)

SELECT DISTINCT
	f.film_id,
	title
FROM 
	 film AS f
LEFT JOIN inventory AS i
	ON f.film_id = i.film_id
WHERE f.title SIMILAR TO '[P-Z]%' AND i.film_id IS NULL 


-- 5.

SELECT 
	first_name,
	last_name,
	SUM(pay.amount)
FROM
	customer AS cus
INNER JOIN payment AS pay
	ON cus.customer_id = pay.customer_id
WHERE cus.first_name LIKE 'B%'
GROUP BY cus.first_name, cus.last_name


	



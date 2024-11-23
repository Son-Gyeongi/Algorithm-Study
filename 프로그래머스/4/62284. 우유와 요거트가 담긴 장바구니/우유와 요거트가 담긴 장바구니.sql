SELECT CP1.CART_ID
FROM (
    SELECT *
    FROM CART_PRODUCTS
    WHERE NAME = 'Milk'
) AS CP1
LEFT JOIN (
    SELECT *
    FROM CART_PRODUCTS
    WHERE NAME = 'Yogurt'
) AS CP2 ON CP1.CART_ID = CP2.CART_ID
WHERE CP2.CART_ID IS NOT NULL
GROUP BY CP1.CART_ID
ORDER BY CP1.CART_ID ASC;
SELECT YEAR, MONTH, GENDER, COUNT(*) AS USERS
FROM (
    SELECT USER_ID, YEAR(SALES_DATE) AS YEAR, MONTH(SALES_DATE) AS MONTH
    FROM ONLINE_SALE
    GROUP BY USER_ID, YEAR, MONTH
) AS OS
JOIN USER_INFO UI ON OS.USER_ID = UI.USER_ID
WHERE GENDER IS NOT NULL
GROUP BY YEAR, MONTH, GENDER
ORDER BY YEAR, MONTH, GENDER;
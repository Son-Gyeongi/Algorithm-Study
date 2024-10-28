SELECT DATE_FORMAT(DATETIME, "%k") HOUR, COUNT(*) COUNT
FROM ANIMAL_OUTS
GROUP BY HOUR HAVING 8 < HOUR AND HOUR < 20
ORDER BY HOUR*1;
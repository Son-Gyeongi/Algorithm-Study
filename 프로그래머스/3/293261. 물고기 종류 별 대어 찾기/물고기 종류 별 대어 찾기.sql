SELECT FI.ID, FNI.FISH_NAME, FI.LENGTH
FROM FISH_INFO FI
JOIN FISH_NAME_INFO FNI USING(FISH_TYPE)
WHERE ID IN (
            SELECT ID
            FROM FISH_INFO
            WHERE (FISH_TYPE, LENGTH) IN (
                                        SELECT FISH_TYPE, MAX(LENGTH)
                                        FROM FISH_INFO
                                        GROUP BY FISH_TYPE
            )
)
ORDER BY FI.ID;
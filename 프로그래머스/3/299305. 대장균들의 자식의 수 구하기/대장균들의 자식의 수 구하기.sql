SELECT E.ID,
    CASE
        WHEN COUNT IS NOT NULL THEN EDS.COUNT
        ELSE 0
    END AS CHILD_COUNT
FROM ECOLI_DATA E
LEFT JOIN (
    SELECT PARENT_ID, COUNT(*) AS COUNT
    FROM ECOLI_DATA
    WHERE PARENT_ID IS NOT NULL
    GROUP BY PARENT_ID
) AS EDS ON E.ID = EDS.PARENT_ID
ORDER BY E.ID;
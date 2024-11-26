SELECT HE.EMP_NO, HE.EMP_NAME,
    CASE
        WHEN AVG_SCORE >= 96 THEN 'S'
        WHEN AVG_SCORE >= 90 THEN 'A'
        WHEN AVG_SCORE >= 80 THEN 'B'
        ELSE 'C'
    END AS GRADE,
    CASE
        WHEN AVG_SCORE >= 96 THEN HE.SAL*0.2
        WHEN AVG_SCORE >= 90 THEN HE.SAL*0.15
        WHEN AVG_SCORE >= 80 THEN HE.SAL*0.1
        ELSE 0
    END AS BONUS
FROM HR_EMPLOYEES HE
JOIN (
    SELECT EMP_NO, AVG(SCORE) AS AVG_SCORE
    FROM HR_GRADE
    GROUP BY EMP_NO
) AS HGS ON HE.EMP_NO = HGS.EMP_NO
ORDER BY HE.EMP_NO;
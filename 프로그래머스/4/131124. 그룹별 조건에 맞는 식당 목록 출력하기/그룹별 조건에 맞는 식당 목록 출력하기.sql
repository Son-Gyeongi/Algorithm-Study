SELECT M.MEMBER_NAME, R.REVIEW_TEXT, DATE_FORMAT(R.REVIEW_DATE, "%Y-%m-%d") AS REVIEW_DATE
FROM REST_REVIEW R
LEFT JOIN MEMBER_PROFILE M ON R.MEMBER_ID = M.MEMBER_ID
WHERE R.MEMBER_ID IN (
    SELECT MEMBER_ID
    FROM REST_REVIEW
    GROUP BY MEMBER_ID HAVING COUNT(*) = (
                                            SELECT MAX(COUNT)
                                            FROM (
                                                SELECT MEMBER_ID, COUNT(*) COUNT
                                                FROM REST_REVIEW
                                                GROUP BY MEMBER_ID
                                            ) AS R
    )
)
ORDER BY REVIEW_DATE, REVIEW_TEXT;
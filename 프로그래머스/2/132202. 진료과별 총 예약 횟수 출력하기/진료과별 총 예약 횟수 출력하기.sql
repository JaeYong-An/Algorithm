-- 코드를 입력하세요
SELECT MCDP_CD, COUNT(1)
FROM APPOINTMENT
WHERE APNT_YMD >= '2022-05-01' AND APNT_YMD < '2022-06-01'
GROUP BY MCDP_CD
ORDER BY 2, 1
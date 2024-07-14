# SELECT dr_name, dr_id, mcdp_cd, hire_ymd
# FROM doctor
# WHERE mcdp_cd IN ('CS', 'GS')
# ORDER BY hire_ymd DESC, dr_name ASC

SELECT DR_NAME, DR_ID, MCDP_CD, DATE_FORMAT(HIRE_YMD, '%Y-%m-%d') AS HIRE_YMD
FROM DOCTOR
WHERE MCDP_CD = 'CS' OR MCDP_CD = 'GS'
ORDER BY HIRE_YMD DESC, DR_NAME
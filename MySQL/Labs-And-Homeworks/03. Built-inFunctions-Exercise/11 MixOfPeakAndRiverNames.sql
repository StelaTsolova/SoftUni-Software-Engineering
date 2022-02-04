SELECT `peak_name`, 
`river_name`,
LOWER(CONCAT(`peak_name`, substr(`river_name`, 2))) AS 'mix'
FROM `peaks`, `rivers`
WHERE RIGHT(`peak_name`, 1) = LEFT(`river_name`, 1)
ORDER BY `mix`;
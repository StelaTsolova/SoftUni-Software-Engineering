SELECT c.`country_name`, r.`river_name`
FROM `countries` AS c
JOIN `continents` AS con
ON c.`continent_code` = con.`continent_code`
LEFT JOIN `countries_rivers` AS cr
ON c.`country_code` = cr.`country_code`
LEFT JOIN `rivers` AS r
ON cr.`river_id` = r.`id`
WHERE con.`continent_name` = 'Africa'
ORDER BY c.`country_name`
LIMIT 5;
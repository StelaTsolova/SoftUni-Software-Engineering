DELETE FROM `clients` 
WHERE `id` NOT IN (SELECT `client_id` FROM `courses`) AND CHAR_LENGTH(`full_name`) > 3;
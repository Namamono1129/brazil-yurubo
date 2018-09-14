SELECT
	brazil.id,
	brazil.string_id,
	brazil.name,
	brazil.password_hash
FROM
	brazil
INNER JOIN
	(SELECT * FROM membership WHERE brazilian_id = /* brazilianId */1) AS membership
	ON brazil.id = membership.brazil_id
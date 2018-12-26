# Write your MySQL query statement below
SELECT Score,(SELECT COUNT(DISTINCT Score) FROM Scores where Score > a.Score) + 1 Rank
from Scores a
ORDER by Score DESC;

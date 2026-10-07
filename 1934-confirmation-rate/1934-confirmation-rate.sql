# Write your MySQL query statement below
select s.user_id,COALESCE(round(avg(c.action = 'confirmed'),2),0) confirmation_rate 
 from signups s
left join confirmations c
on s.user_id=c.user_id 
group by s.user_id
;

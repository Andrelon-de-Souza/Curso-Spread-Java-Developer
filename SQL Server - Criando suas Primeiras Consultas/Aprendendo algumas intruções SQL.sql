
inner join
left join
right join

select *
from Clientes cli
inner join Pedido ped
on	cli.Codigo = ped.CodigoCliente

select *
from Clientes cli
left join Pedido ped
on	cli.Codigo = ped.CodigoCliente

select *
from Pedido ped
right join Clientes cli
on	cli.Codigo = ped.CodigoCliente
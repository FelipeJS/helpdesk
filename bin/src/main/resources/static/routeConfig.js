angular.module("helpdesk").config(function ($routeProvider) {
	$routeProvider.when("/produto", {
		templateUrl: "produto/produto.html",
		controller: "produtoCtrl"
	});
	$routeProvider.when("/cliente", {
		templateUrl: "cliente/cliente.html",
		controller: "clienteCtrl"
	});
	$routeProvider.when("/vendedor", {
		templateUrl: "vendedor/vendedor.html",
		controller: "vendedorCtrl"
	});
	$routeProvider.when("/venda", {
		templateUrl: "venda/venda.html",
		controller: "vendaCtrl"
	});
	$routeProvider.when("/usuario", {
		templateUrl: "usuario/usuario.html",
		controller: "usuarioCtrl"
	});
	$routeProvider.when("/chamado", {
		templateUrl: "chamado/chamado.html",
		controller: "chamadoCtrl"
	});
	$routeProvider.otherwise({redirectTo: "/produto"});
});
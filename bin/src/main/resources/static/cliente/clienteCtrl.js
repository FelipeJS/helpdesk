angular.module("helpdesk").controller("clienteCtrl", function ($scope, $http) {
		$scope.novoCliente = function (cliente) {
			$http.post("cliente/novo", cliente).success(function (resultadoDoResponse) {
				$scope.cliente = resultadoDoResponse;
			});
		};		
	});

angular.module("helpdesk").controller("chamadoCtrl", function ($scope, $http) {
		$scope.novoChamado = function (chamado) {
			$http.post("chamado/novo", chamado).success(function (resultadoDoResponse) {
				$scope.chamado = resultadoDoResponse;
			});
		};		
	});

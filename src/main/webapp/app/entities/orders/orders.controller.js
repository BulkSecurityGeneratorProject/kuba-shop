(function() {
    'use strict';

    angular
        .module('kubaShopApp')
        .controller('OrdersController', OrdersController);

    OrdersController.$inject = ['$scope', '$state', 'Orders'];

    function OrdersController ($scope, $state, Orders) {
        var vm = this;

        vm.orders = [];

        loadAll();

        function loadAll() {
            Orders.query(function(result) {
                vm.orders = result;
                vm.searchQuery = null;
            });
        }
    }
})();

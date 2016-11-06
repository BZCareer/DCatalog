'use strict';

angular.module('myApp.datapipelineadmin', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/datapipelineadmin', {
    templateUrl: 'DatapipelineAdmin/datapipelineadmin.html',
    controller: 'DatapipelineAdminCtrl'
  });
}])

.controller('DatapipelineAdminCtrl', [function() {

}]);

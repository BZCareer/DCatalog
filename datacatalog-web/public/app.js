'use strict';

// Declare app level module which depends on views, and components
angular.module('myApp', [
  'ngRoute', 
  'myApp.datapipelineadmin',
  'myApp.dashboard',
  'myApp.version'
]).
config(['$routeProvider', function($routeProvider) {
  $routeProvider.otherwise({redirectTo: '/dashboard'});
}]);

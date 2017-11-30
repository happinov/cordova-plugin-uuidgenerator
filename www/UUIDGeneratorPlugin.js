var UUIDGeneratorPlugin = {
	pluginClass: 'UUIDGeneratorPlugin',

	_generate: function(successCallback, errorCallback){
		cordova.exec(successCallback, errorCallback, UUIDGeneratorPlugin.pluginClass, 'generate',[]);
	},
	generateUppercase: function(successCallback, errorCallback){
		UUIDGeneratorPlugin._generate(function(result){
			successCallback(result.toUpperCase());
		},errorCallback);
	},
	generateLowercase: function(successCallback, errorCallback){
		UUIDGeneratorPlugin._generate(function(result){
			successCallback(result.toLowerCase());
		},errorCallback);
	},
};

module.exports = UUIDGeneratorPlugin;

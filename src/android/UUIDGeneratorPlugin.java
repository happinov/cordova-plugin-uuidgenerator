package fr.happinov.cordova.plugin.uuidgenerator;

import java.util.UUID;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

public class UUIDGeneratorPlugin extends CordovaPlugin {
	private static final String TAG = UUIDGeneratorPlugin.class.getSimpleName();

	public UUIDGeneratorPlugin() {
	}

	@Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		if (action.equals("generate"))
			generate(callbackContext);
		else
			return false;

		return true;
	}

	private void generate(CallbackContext callbackContext) {
		callbackContext.success(UUID.randomUUID().toString());
	}
}

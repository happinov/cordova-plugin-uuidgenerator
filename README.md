# UUID Generator Plugin for Cordova

## Description
This plugins uses native generator functions to provide proper UUIDs that should be much better than anything generated using pure js.

It uses `UUID().uuidString` on iOS and `UUID.randomUUID().toString()` on Android.

## Usage
You can generate either uppercase or lowercase UUID.

```
UUIDGenerator.generateUppercase(function(generatedUUID){
        console.log(generatedUUID);
});
```

```
UUIDGenerator.generateLowercase(function(generatedUUID){
        console.log(generatedUUID);
});
```

## License
This code is released under the [MIT license](LICENSE).

## Changelog

## 1.0.0
  * Initial release supporting both iOS and Android.

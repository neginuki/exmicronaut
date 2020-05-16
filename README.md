# exmicronaut

Micronaut のおためし記録


1. CLI ツールをダウンロードして mn コマンドが使えるようにする。
https://micronaut.io/download.html

1. プロジェクトの作成
適当なディレクトリで mn create-app exmicronaut --features graal-native-image

1. Exclipse から Buildship で取り込む
Import > Gradle > Existing Gradle Project で作成されたディレクトリを指定

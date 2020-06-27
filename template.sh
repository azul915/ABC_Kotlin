#!/bin/bash

function createDirectory() {
  while :
  do
    read -e -p "Please enter a directory path. >" inputDirPath

    if [ -z $inputDirPath ]; then
      echo "Illegal input. Pleas try again."
    else
      break
    fi
  done

  if [[ $inputDirPath == *"~/"* ]]; then
    inputDirPath="${inputDirPath//\~/$HOME}"
  fi

  if [[ ! -d $inputDirPath ]]; then
    mkdir -p $inputDirPath
    echo "Directory created."
  else
    echo "A directory name that already exists."
  fi

  dirPath=$inputDirPath
  echo $dirPath
}

function touchKtFile() {
  while :
  do
    read -e -p "Please enter a .kt file name. >" inputFileName

    if [ -z $inputFileName ]; then
      echo "Illegal input. Pleas try again."
    else
      break
    fi
  done

  if [[ ! $inputFileName == *".kt"* ]]; then
      inputFileName="${inputFileName}.kt"
  fi

  fileName=$inputFileName
  cat <<EOF > $fileName
fun main(args: Array<String>) {
    val arrayInt: Array<Int> = Array(2) { readLine()!!.toInt() }
    val (a, b) = Array(2) { readLine()!!.toInt() }
    val (x, y, z) = Array(3) { readLine()!!.toInt() }

    val listInt: List<Int> = readLine!!.split(" ").map { it.toInt() }
    val hoge: List<String> = (1..2).map { readLine()!! }
}
EOF

}

createDirectory && cd $dirPath && touchKtFile
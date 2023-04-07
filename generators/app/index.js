"use strict";
const Generator = require("yeoman-generator");
const chalk = require("chalk");
const yosay = require("yosay");
const path = require("path");

module.exports = class extends Generator {
  prompting() {
    // Have Yeoman greet the user.
    this.log(
      yosay(
        `Welcome to the priceless ${chalk.red(
          "generator-spring-mono"
        )} generator!`
      )
    );

    const prompts = [
      {
        type: "input",
        name: "name",
        message: "Your project name",
        default: path.basename(process.cwd())
      }
    ];

    return this.prompt(prompts).then(props => {
      // To access props later use this.props.someAnswer;
      this.props = props;
    });
  }

  writing() {
    this.fs.copyTpl(
      this.templatePath("settings.gradle"),
      this.destinationPath("settings.gradle"),
      {
        name: this.props.name
      }
    );
    const plain = ["buildSrc", "demo-api", "demo-server", "demo-client"];
    plain.forEach(it => {
      this.fs.copy(this.templatePath(it), this.destinationPath(it));
    });
  }
};

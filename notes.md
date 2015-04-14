The important rules to follow to make this script available as a git sub-command are:

- It should be named git-COMMANDNAME, in this case it’s called git-activity
- and it needs to be executable and available on the $PATH

## Man pages

If the custom command has an accompanying man page, the git help command will show the help information as well.
Bonus tip Man pages can easily be generated from Markdown using [Pandoc](http://pandoc.org)

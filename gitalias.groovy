#!/usr/bin/env groovy

'git config --local alias.move checkout'.execute()
'git config --local alias.unstash stash pop'.execute()
'gir config --local alias.tree git log --graph --oneline --decorate'.execute()

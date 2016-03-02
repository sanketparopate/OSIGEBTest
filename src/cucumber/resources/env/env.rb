ENV['TAZA_ENV'] ||= "local"
ENV['HTTP_PROXY'] = nil
ENV['http_proxy'] = nil

require 'rubygems'
require 'selenium-webdriver'
require 'rest-client'

env_type = ENV['targ  et'] ||= "development"
require "#{File.expand_path(File.dirname(__FILE__))}/../../lib/lib"
require "#{File.expand_path(File.dirname(__FILE__))}/../../config/#{env_type}" 